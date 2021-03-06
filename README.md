# Object Oriented Design OOD
Для каждой группы паттернов(их 3) будет своя соответствующая ветка.
## Паттерны создания объектов
Есть мнение, что необходимость в некоторых паттернах вызвана недостатком конкретного языка программирования.
Может и так, но раз уж используемый нами язык не предоставляет нативный способ решения проблемы, то почему бы не воспользоваться идеей, которая уже кем-то проверена и является достаточно эффективной, если не оптимальной.
### Первая группа - это creational паттерны. Они в той или иной степени работают с механизмами создания объектов.

* Singleton - обеспечиваем существование в системе ровно одного экземпляра некоторого класса;
* Factory Method - делегируем процесс создания объектов классам-наследникам;
* Prototype - клонируем объекты на основании некоторого базового объекта;
* Builder - отделяем процесс создания комплексного объекта от его представления;
* Abstract Factory - описываем сущность для создания целых семейств взаимосвязанных объектов.
### Структурные паттерны
* Вторая группа - структурные паттерны (structural). Они описывают создание более сложных объектов, либо упрощают работу с другими объектами сисетмы.
* Adapter - на основании некоторого класса создаем необходимый клиенту интерфейс;
* Facade - описываем унифицированный интерфейс для облегчения работы с набором подсистем;
* Composite - работаем с базовыми и составными объектами единым образом;
* Decorator - динамически добавляем новую функциональность некоторому объекту, сохраняя его интерфейс;
* Proxy - создаем объект, который перехватывает вызовы к другому объекту;
* Bridge - разделяем абстракцию от интерфейса, позволяя им меняться независимо;
* Flyweight - эффективно работаем с огромным количеством схожих объектов.
* Поведенческие паттерны проектирования

### Наконец, третья группа - поведенческие шаблоны (behavioral). Они определяют эффективные способы взаимодействия различных объектов в системе.
* Strategy - описываем набор взаимозаменяемых алгоритмов с единым интерфейсом;
* Iterator - обеспечиваем доступ к коллекциям объектов без раскрытия внутреннего устройства этих коллекций;
* Observer - создаем объект для отслеживания изменений в подсистеме и нотификации других подсистем;
* Memento - сохраняем внутреннее состояние объекта для последующего использования без нарушения инкапсуляции;
* Command - описываем объект, представляющий собой некоторое действие, которое можно выполнить в необходимый момент;
* Interpreter - определяем способ вычисления выражений некоторого языка;
* Mediator - создаем объект, которые регулирует взаимодействие между набором подсистем;
* State - позволяем объекту менять свое поведение при изменении его внутреннего состояния;
* Template method - описываем алгоритм, возлагая реализацию некоторых частей алгоритма на подклассы;
* Visitor - отделяем алгоритм от структуры, с которыми алгоритм работает;
* Chain of responsibility - пропускаем некоторый запрос через набор обработчиков событий, до тех пор пока запрос не будет обработан.
### Антипаттерны проектирования
Считаю важным знать не только удачные способы решения задач, но и возможные ошибки при их решении.
* Интерфейс для констант - используем Java интерфейс не по назначению;
* Вресенная сложность - добавляем ненужные сущности в иерархию классов.

# Extra info
* Класс = способ организации полей, методов и пр. = инкапсулированный «кусок» функциональности, описание структуры будущих объектов + своё пространство имён внутри.
* Объект = экземпляр класса = объект, типом которого является какой-то класс = класс после инициализации = сущность в памяти, обладающая поведением, способная изменять своё состояние.

