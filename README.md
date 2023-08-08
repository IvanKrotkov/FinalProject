# Итоговая контрольная работа
___
## Информация о проекте
> Необходимо организовать систему учета для питомника в котором живут домашние и вьючные животные.
1. ### Часть работы с линуксом
*Работа с линуксом представлена в пдф файле [Linux](linux_part.pdf).*

2. ### Часть работы с MYSQL 
*Работа представлена в виде скриншотов и команд в файле [MYSQL](mysql.pdf).*

3. ### Структура программы на языке JAVA

*Проект разбит на две состовляющие **Core** и **MVP**:*

*В директории [Core](/FinalProj/src/Core/) содержатся все необходимые классы животных для работы приложения. Один общий класс родительский [ParentClass](/FinalProj/src/Core/ParentClass.java), от которого наследуются ещё два абстрактных класса [Pets](/FinalProj/src/Core/Pets.java) - класс домашних животных и [PackAnimal](/FinalProj/src/Core/PackAnimal.java) - класс вьючных животных. Также создан класс [Counter](/FinalProj/src/Core/Counter.java) по ТЗ.*

*В директории [MVP](/FinalProj/src/MVP/) точка запуска приложения, работа с менюшкой.*
>[APP](/FinalProj/src/MVP/App.java) - точка запуска
