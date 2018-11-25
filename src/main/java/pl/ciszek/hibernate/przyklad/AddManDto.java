package pl.ciszek.hibernate.przyklad;

public class AddManDto {

    private Long man_id;
    private String man_name;
    private String man_surname;
    private int man_age;

    public AddManDto() {
    }

    public AddManDto(Long man_id, String man_name, String man_surname, int man_age) {
        this.man_id = man_id;
        this.man_name = man_name;
        this.man_surname = man_surname;
        this.man_age = man_age;
    }

    public Long getMan_id() {
        return man_id;
    }

    public void setMan_id(Long man_id) {
        this.man_id = man_id;
    }

    public String getMan_name() {
        return man_name;
    }

    public void setMan_name(String man_name) {
        this.man_name = man_name;
    }

    public String getMan_surname() {
        return man_surname;
    }

    public void setMan_surname(String man_surname) {
        this.man_surname = man_surname;
    }

    public int getMan_age() {
        return man_age;
    }

    public void setMan_age(int man_age) {
        this.man_age = man_age;
    }
}
