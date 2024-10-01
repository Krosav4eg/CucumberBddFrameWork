@Categories
Feature: Rozetka categories

  Background: Navigate to the main catalog page
    Given I navigate to home page
    And Click on close button in expo area banner
    And User clicks on Rozetka icon in header menu

  @Test-3
  Scenario: Verify partner categories
    And User scrolls to the 'Партнерам' section
    Then User sees following sub categories in section 'Партнерам':
      | Продавать на Розетке  |
      | Сотрудничество с нами |
      | Франчайзинг           |
      | Аренда помещений      |


#  @Test-4
#  Scenario: Verify main categories menu
#    Then user check main categories menu list:
#      | Ноутбуки и компьютеры       |
#      | Смартфоны, ТВ и электроника |
#      | Товары для геймеров         |
#      | Бытовая техника             |
#      | Товары для дома             |
#      | Инструменты и автотовары    |
#      | Сантехника и ремонт         |
#      | Дача, сад и огород          |
#      | Спорт и увлечения           |
#      | Одежда, обувь и украшения   |
