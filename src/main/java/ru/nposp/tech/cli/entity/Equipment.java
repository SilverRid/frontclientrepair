package ru.nposp.tech.cli.entity;


import lombok.Data;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Data
public class Equipment {

    private int id;
    private String eqName;
    private String partNumber;
    private int serialNumber;
    private String malfunction;
    private String statusRepair;
    private Company company;

    public Equipment() {
    }

    public Equipment(final String eqName, final String partNumber, final int serialNumber,
                     final String malfuntion,
                     final String statusRepair) {

        this.eqName = eqName;
        this.partNumber = partNumber;
        this.serialNumber = serialNumber;
        this.malfunction = malfuntion;
        this.statusRepair = statusRepair;
    }

    @Override
    public String toString() {
        return "Equipment{" +
            "id=" + id +
            ", eqName='" + eqName + '\'' +
            ", partNumber='" + partNumber + '\'' +
            ", serialNumber=" + serialNumber +
            ", malfunction='" + malfunction + '\'' +
            ", statusRepair='" + statusRepair + '\'' +
            ", company=" + company +
            '}';
    }
}
