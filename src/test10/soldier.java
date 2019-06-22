package test10;

public class soldier {
    public soldier(String soldier) {
        this.soldier = soldier;
    }
    private String soldier;

    public String getSoldier() {
        return soldier;
    }

    public void setSoldier(String soldier) {
        this.soldier = soldier;
    }
    private Abstractgun gun;

    public void setGun(Abstractgun gun) {
        this.gun = gun;
    }

    public void killenemy(){
        System.out.println("士兵"+soldier+"开始射杀");

        gun.shoot();
    }
}
