@Filter
Feature: Rozetka filter

  Background: Navigate to the main catalog page
    Given I navigate to home page

  @Test-1
  Scenario: Verify selected goods size
    When check that all goods items have size

  @Test-2
  Scenario: Check that goods tiles contains search word
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
