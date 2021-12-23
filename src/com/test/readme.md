**Сравнение ArrayList, LinkedList**

**Добавление элементов**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 001](https://user-images.githubusercontent.com/92465640/143658439-da059794-4a8f-4745-8399-3f0701de8ead.png)

**Вставка элементов в начало**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 002](https://user-images.githubusercontent.com/92465640/143658500-80279480-6a71-4966-85b2-cead549e9a56.png)
**Вставка элементов в середину**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 003](https://user-images.githubusercontent.com/92465640/143658503-69680573-10f3-4871-a660-0d69853ef897.png)

**Вставка элементов в конец**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 004](https://user-images.githubusercontent.com/92465640/143658504-17085090-6dc7-463e-a419-bb2f8294ffd5.png)

**Удаление элементов в начало**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 005](https://user-images.githubusercontent.com/92465640/143658499-6eb91385-cc09-4729-b203-f5f5293fcba4.png)


**Удаление элементов в середину**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 005](https://user-images.githubusercontent.com/92465640/143658499-6eb91385-cc09-4729-b203-f5f5293fcba4.png)

**Удаление элементов в конец**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 006](https://user-images.githubusercontent.com/92465640/143658546-7b4335ae-5ccc-4465-977d-ca6bcc1e708a.png)

**Итоги сравнения:**

ArrayList работает быстрее при добавлении. При вставке в середину и в конец, а при удалении в конце тоже работает быстрее. Во всех других случаях LinkedList работает быстрее.

Следовательно при частой вставке и удаления лучше использовать LinkedList, в противном случае ArrayList. 













**Сравнение HashSet, LinkedHashSet, TreeSet**

**Добавление элементов**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 007](https://user-images.githubusercontent.com/92465640/143658547-05b673a4-c70b-42cf-9d2b-159f531b95f0.png)

**Вставка элементов в начало**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 008](https://user-images.githubusercontent.com/92465640/143658548-daabcc68-42f2-4a0a-9992-b976fcb1d913.png)

**Вставка элементов в середину**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 009](https://user-images.githubusercontent.com/92465640/143658549-8e7ac14f-7d42-42a6-84df-0bb4a343a851.png)


**Вставка элементов в конец**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 010](https://user-images.githubusercontent.com/92465640/143658550-36fb4053-ce68-4ed3-99af-90ef9a7185d1.png)

**Удаление элементов в начале**

![Aspose Words d8b3685e-321a-4f6e-99ef-60e124891a87 001](https://user-images.githubusercontent.com/92465640/143659317-9b721ced-27e4-4528-bc76-3551e3625e4e.png)

**Удаление элементов в середине**

![2](https://user-images.githubusercontent.com/92465640/143659312-d760a1b8-e376-4808-a02b-2df7eaeaadd8.png)

**Удаление элементов в конце**

![3](https://user-images.githubusercontent.com/92465640/143659314-3185cd43-84a3-4083-aade-79b32d33aca3.png)


**Итоги сравнения:**

LinkedHashSet работает быстрее на удаление и на вставку в середине.

HashSet работает быстрее на добавление и на вставку в начало и в конец.

TreeSet работает медленнее во всех случаях. 

Следовательно HashSet - самый быстрый, LinkedHashSet - второй по производительности, но TreeSet работает медленнее из-за операции сортировки, которую он должен выполнять при каждой вставке.

**Сравнение HashMap, LinkedHashMap, TreeMap**

**Добавление элементов**

![1](https://user-images.githubusercontent.com/92465640/143659470-9d1a701b-49fd-443b-8990-d14f24ce914b.png)

**Вставка элементов в начало**

![2](https://user-images.githubusercontent.com/92465640/143659460-08766a8e-5ef1-488e-8ed7-4ad7a3954f1f.png)

**Вставка элементов в середину**

![3](https://user-images.githubusercontent.com/92465640/143659461-4771ed1c-ad11-4fff-b3bb-8fcb4ae0a5f8.png)

**Вставка элементов в конец**

![4](https://user-images.githubusercontent.com/92465640/143659463-18d04084-b391-492b-9367-62eacf6f8e1d.png)

**Удаление элементов в начале**

![5](https://user-images.githubusercontent.com/92465640/143659464-31337b90-32a4-47d6-8361-21cbd1f706be.png)

**Удаление элементов в середине**

![6](https://user-images.githubusercontent.com/92465640/143659466-96bedc1e-e66d-49ed-a7fe-00d4852d9675.png)

**Удаление элементов в конце**

![7](https://user-images.githubusercontent.com/92465640/143659469-00afe7fa-1dad-4855-be82-3e8d94611e5f.png)

**Итоги сравнения:**

HashMap работает быстрее на добавление и на вставку в начало и в конец.

LinkedHashMap работает быстрее на удаление в начале и в середине

TreeMap работает быстрее при вставке в середину.

Следовательно HashSet - самый быстрый, LinkedHashSet - второй по производительности и TreeSet работает медленнее.

