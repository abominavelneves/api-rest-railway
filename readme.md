```mermaid
classDiagram
    class User {
      +String name
    }
    class Account {
      +String number
      +String agency
      +Float balance
      +Float limit
    }
    class Feature {
      +String icon
      +String description
    }
    class Card {
      +String number
      +Float limit
    }
    class News {
      +String icon
      +String description
    }

    User --> Account
    User --> Feature
    User --> Card
    User --> News
``` 