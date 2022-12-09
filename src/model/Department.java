package model;


public enum Department {
    SOTORPE("Sotorpe"), SER_VICIOS("Ser Vicios"), DESARROLLO("En mi local funciona");
    String code;
    Department(String code) {this.code = code;}
    public String getCode() {return code;}
}