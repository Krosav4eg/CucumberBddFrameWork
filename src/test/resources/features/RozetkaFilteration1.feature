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
      | Ноутбуки та комп’ютери      |
      | Смартфони, ТВ і електроніка |
      | Товари для геймерів         |
      | Побутова техніка            |
      | Товари для дому             |
      | Інструменти та автотовари   |
      | Сантехніка та ремонт        |
      | Дача, сад і город           |
      | Спорт і захоплення          |
      | Одяг, взуття та прикраси    |
