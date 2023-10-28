package com.brianeno.fakerexample;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class SampleTests {

  @Test
  void testFakeLocal() {
    Faker usFaker= new Faker(new Locale("en-US"));
    System.out.println(String.format("City in US: %s", usFaker.address().city()));

    Faker ukFaker= new Faker(new Locale("en-GB"));
    System.out.println(String.format("City in UK: %s", ukFaker.address().city()));
  }

  @Test
  void testFakeAddress() {
    Faker faker = new Faker(Locale.US);
    String city = faker.address().city();
    String state = faker.address().state();
    String country = faker.address().country();

    String streetName = faker.address().streetName();
    String streetAddress = faker.address().streetAddress();
    String zipCode = faker.address().zipCode();

    System.out.println(streetAddress);

  }

  @Test
  void testFakeFinance() {
    Faker faker = new Faker(Locale.US);
    String amex = faker.finance().creditCard(CreditCardType.AMERICAN_EXPRESS);
    String visa = faker.finance().creditCard(CreditCardType.VISA);
    String masterCard = faker.finance().creditCard(CreditCardType.MASTERCARD);
    String bic = faker.finance().bic();
    String iban = faker.finance().iban();
    System.out.println(masterCard);
  }

  @Test
  void testFakeInternet() {
    Faker faker = new Faker(Locale.US);
    String email = faker.internet().emailAddress();
    String domainName = faker.internet().domainName();
    String image = faker.internet().image();
    String ipv4 = faker.internet().ipV4Address();
    String mac = faker.internet().macAddress();
    String ipv4Cdr = faker.internet().ipV4Cidr();
    String ipv6 = faker.internet().ipV6Address();
    String ipv6Cdr = faker.internet().ipV6Cidr();
    String domainSfx = faker.internet().domainSuffix();
    String domainWrd = faker.internet().domainWord();

    System.out.println(ipv4);
  }


  @Test
  void testFakePhone() {
    Faker faker = new Faker(Locale.US);
    String phoneNumber = faker.phoneNumber().phoneNumber();
    String cellPhone = faker.phoneNumber().cellPhone();
    String extension = faker.phoneNumber().extension();
    String subscriberNumber = faker.phoneNumber().subscriberNumber();
    System.out.println(cellPhone);
  }

  @Test
  void testFakeName() {
    Faker faker = new Faker(Locale.US);
    String prefix = faker.name().prefix();
    String first = faker.name().firstName();
    String last = faker.name().lastName();
    String suffix = faker.name().suffix();
    String fullName = faker.name().fullName();
    String username = faker.name().username();
    String nameWithMiddle = faker.name().nameWithMiddle();
    String bloodGroup = faker.name().bloodGroup();
    String title = faker.name().title();

    System.out.println(nameWithMiddle);
  }

  @Test
  void testFakeNumber() {
    Faker faker = new Faker(Locale.US);
    String digit = faker.number().digit();
    int randomDigit = faker.number().randomDigit();
    int randomDigitNotZero = faker.number().randomDigitNotZero();
    int number10 = faker.number().numberBetween(10, 20);
    long ranLng = faker.number().randomNumber();
    double ranDbl = faker.number().randomDouble(3, 1, 10);
    System.out.println(number10);
  }

  @Test
  void testFakeDate() {
    Faker faker = new Faker(Locale.US);
    Date future = faker.date().future(30, TimeUnit.DAYS);
    Date past = faker.date().past(30, TimeUnit.DAYS);
    Date bDay = faker.date().birthday();
    Date bDayTeen = faker.date().birthday(13, 19);

    System.out.println(bDay);
  }


  @Test
  void testFakeCurrency() {
    Faker faker = new Faker(Locale.US);
    String currencyName = faker.currency().name();
    String currencyCode = faker.currency().code();
    System.out.println(currencyName);
  }

  @Test
  void testFakeCompany() {
    Faker faker = new Faker(Locale.US);
    String name = faker.company().name();
    String suffix = faker.company().suffix();
    String bs = faker.company().bs();
    String buzzword = faker.company().buzzword();
    String logo = faker.company().logo();
    String profession = faker.company().profession();
    String industry = faker.company().industry();
    String url = faker.company().url();
    System.out.println(name);
  }

  @Test
  void testFakeDemographic() {
    Faker faker = new Faker(Locale.US);
    String sex = faker.demographic().sex();
    String race = faker.demographic().race();
    String demonym = faker.demographic().demonym();
    String educationalAttainment = faker.demographic().educationalAttainment();
    String maritalStatus = faker.demographic().maritalStatus();

    System.out.println(sex);
  }

  @Test
  void testFakeJob() {
    Faker faker = new Faker(Locale.US);
    String field = faker.job().field();
    String title = faker.job().title();
    String position = faker.job().position();
    String keySkills = faker.job().keySkills();
    String seniority = faker.job().seniority();

    System.out.println(keySkills);
  }

  @Test
  void testEfy() {
    Faker faker = new Faker(Locale.US);
    String num = faker.numerify("###");
    String letter = faker.letterify("????");
    String mixed = faker.bothify("#?#?#?#?");
    String regex = faker.regexify("[a-fA-F0-9]");

    System.out.println(num);
  }

  @Test
  void testFakeMisc() {
    Faker faker = new Faker(Locale.US);
    String isbn13 = faker.code().isbn13();
    Boolean bool = faker.bool().bool();
    String colorName = faker.color().name();
    String filename = faker.file().fileName();
    String appName = faker.app().name();
    String animalName = faker.animal().name();
    String capitalCity = faker.nation().capitalCity();
    String instrument = faker.music().instrument();
    String temperatureFahrenheit = faker.weather().temperatureFahrenheit();
    String medicineName = faker.medical().medicineName();
    String sha256 = faker.crypto().sha256();
    String relationShip = faker.relationships().any();
    String fruit = faker.food().fruit();
    String languageCreator = faker.programmingLanguage().creator();
    String title = faker.book().title();
    String author = faker.book().author();
    String publisher = faker.book().publisher();
    String genre = faker.book().genre();
    System.out.println(animalName);
  }
}
