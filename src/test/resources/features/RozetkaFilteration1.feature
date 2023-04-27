@Categories
Feature: Rozetka categories

  Background: Navigate to the main catalog page
    Given I navigate to home page

  @Test-3
  Scenario: Verify notebook categories
    When User clicks on 'Каталог' in header menu
    Then User sees following sub categories in section 'Ноутбуки':
      | Asus                 |
      | Acer                 |
      | HP (Hewlett Packard) |
      | Lenovo               |
      | Dell                 |
      | Apple Macbook        |

  @Test-4
  Scenario: Verify main categories menu
    When User clicks on Rozetka icon in header menu
    Then user check main categories menu list:
      | Ноутбуки и компьютеры       |
      | Смартфоны, ТВ и электроника |
      | Товары для геймеров         |
      | Бытовая техника             |
      | Товары для дома             |
      | Инструменты и автотовары    |
      | Сантехника и ремонт         |
      | Дача, сад и огород          |
      | Спорт и увлечения           |
      | Одежда, обувь и украшения   |
