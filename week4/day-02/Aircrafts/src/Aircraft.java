public class Aircraft {
  String type;
  int ammo;
  int baseDamage;
  int maxAmmo;

  public Aircraft(int ammo, int baseDamage, int maxAmmoa) {
    this.ammo = ammo;
    this.baseDamage = baseDamage;
    this.maxAmmo = maxAmmoa;
  }
  public Aircraft() {
    ammo = 0;
  }

  public  Integer fight() {
    int damage = 0;
    damage = ammo * baseDamage;
    ammo = 0;
    return damage;
  }

  public Integer refill(int i) {
    if (ammo + i > maxAmmo) {
      int remaider = i - (maxAmmo - ammo);
      ammo = maxAmmo;
      return remaider;
    } else {
      ammo += i;
      return 0;
    }
  }


  public String getType() {
    return type;

  }
  public String getStatus() {
    return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + baseDamage * ammo;
  }



}
