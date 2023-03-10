package optional;

public class PhoneBookCrawler {

    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseThrow(() -> new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
      return null;
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return phoneBook.findPhoneNumberByName(name)
                .orElse(phoneBook.findNameByPhoneNumber(phoneNumber)
                        .orElse(phoneBook.findPhoneNumberByName("Jos de Vos").orElse(null)));
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }
}
