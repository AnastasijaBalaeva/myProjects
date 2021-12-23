package com.springboot.parser;

import com.springboot.model.UserForm;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.multipart.MultipartFile;


import java.io.*;
import java.util.Scanner;

public class ParserPackageUsers {
    final String path = "src/main/resources/packageUsers.json";
    final String pathFile = "src/main/resources/files/";

    public void toParserJson(UserForm userForm) throws IOException, ParseException {
        JSONObject packageUserJson = getJsonPackage(userForm);
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(packageUserJson.toJSONString());
        bufferedWriter.flush();
        bufferedWriter.close();
    }


    private JSONObject getJsonPackage(UserForm userForm) throws IOException, ParseException {
        JSONObject root = getPackageObject();
        JSONArray users = (JSONArray) root.get("Users");
        if (users == null) {
            users = new JSONArray();
            root.put("Users", users);
        }
        JSONObject user = new JSONObject();
        user.put("surname", userForm.getSurname());
        user.put("name", userForm.getName());
        user.put("patronymic", userForm.getPatronymic());
        user.put("age", userForm.getAge());
        user.put("salary", userForm.getSalary());
        user.put("email", userForm.getEmail());
        user.put("job", userForm.getJob());
        users.add(user);
        return root;
    }

    private JSONObject getPackageObject() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        JSONObject packages;
        if (!fileIsEmpty(path))
            packages = (JSONObject) jsonParser.parse(new FileReader(path));
        else packages = new JSONObject();
        return packages;
    }
    private boolean fileIsEmpty(String path) {
        File file = new File(path);
        return file.length()==0;
    }

    public UserForm fromParseJson(String surnameUser, String nameUser) throws IOException, ParseException {
        JSONObject userFromPackage = getPackageObject();
        JSONArray users = (JSONArray) userFromPackage.get("Users");
        if(users == null){
            return null;
        }

        for(int i = 0; i< users.size(); i++){
            JSONObject user = (JSONObject) users.get(i);
            if(user.get("surname").equals(surnameUser) && user.get("name").equals(nameUser)) {
                String surname = (String) user.get("surname");
                String name = (String) user.get("name");
                String patronymic = (String) user.get("patronymic");
                int age = ((Long) user.get("age")).intValue();
                int salary = ((Long) user.get("salary")).intValue();
                String email = (String) user.get("email");
                String job = (String) user.get("job");
                return new UserForm(surname ,name ,patronymic, age, salary, email, job);
             }
         }

        return null;
    }



    public  boolean getOriginalFilename(MultipartFile multipartFile) throws IOException, ParseException {
        fileUpload(multipartFile);

        if (readFile(multipartFile)) {
            //toParserJson(userForm);
            return true;
        }
        else return false;
    }

    private void fileUpload(MultipartFile file) throws IOException {
        File convertFile  = new File(pathFile + file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(convertFile);
        fileOutputStream.write(file.getBytes());
        fileOutputStream.close();
    }
    private boolean readFile(MultipartFile file) throws IOException {
        File uploadedFile = new File(pathFile + file.getOriginalFilename());
        FileReader fileReader = new FileReader(uploadedFile);
        Scanner scanner = new Scanner(fileReader);

        JSONObject root = null;
        try {
            root = getPackageObject();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        JSONArray users = (JSONArray) root.get("Users");
        if (users == null) {
            users = new JSONArray();
            root.put("Users", users);
        }
        while (scanner.hasNextLine()) {

            String input = scanner.nextLine();
            String[] inputs = input.split("/");
            if (inputs.length != 7) return false;
            else {

                JSONObject user = new JSONObject();
                user.put("surname", inputs[0]);
                user.put("name", inputs[1]);
                user.put("patronymic", inputs[2]);
                user.put("age", Integer.parseInt(inputs[3]));
                user.put("salary", Integer.parseInt(inputs[4]));
                user.put("job", inputs[5]);
                user.put("email",  inputs[6]);
                users.add(user);

                File fileUpload = new File(path);
                FileWriter fileWriter = new FileWriter(fileUpload);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(root.toJSONString());
                bufferedWriter.flush();
                bufferedWriter.close();

            }
        }
        scanner.close();
        return true;
    }

}
