package ru.nposp.tech.cli.entity;


import lombok.Data;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Data
public class Company {

    private int id;
    private String companyName;
    private String inn;
    private String kpp;
    private String address;

    public Company() {
    }

    public Company(final String companyName, final String inn, final String kpp, final String address) {
        this.companyName = companyName;
        this.inn = inn;
        this.kpp = kpp;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
            "id=" + id +
            ", companyName='" + companyName + '\'' +
            ", inn=" + inn +
            ", kpp=" + kpp +
            ", address='" + address + '\'' +
            '}';
    }
}
