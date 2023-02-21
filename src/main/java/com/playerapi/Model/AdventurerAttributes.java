package com.playerapi.Model;

public class AdventurerAttributes {
    public static final AdventurerAttributes basicAdventurer = new AdventurerAttributes(20.0,0.5,5.0,0.25,10.0,0.25,
            1.0,1.0,0.0,0.0,1.25,1.0,1.0,1.0,1.0,1.0,1.0,0.2);
    public AdventurerAttributes(Double health, Double health_regen, Double mana, Double mana_regen, Double stamina, Double stamina_regen, Double physical_damage, Double magical_damage, Double defense, Double mind, Double attack_speed, Double strength, Double intelligence, Double vitality, Double dexterity, Double agility, Double lucky, Double speed) {
        this.health = health;
        this.health_regen = health_regen;
        this.mana = mana;
        this.mana_regen = mana_regen;
        this.stamina = stamina;
        this.stamina_regen = stamina_regen;
        this.physical_damage = physical_damage;
        this.magical_damage = magical_damage;
        this.defense = defense;
        this.mind = mind;
        this.attack_speed = attack_speed;
        this.strength = strength;
        this.intelligence = intelligence;
        this.vitality = vitality;
        this.dexterity = dexterity;
        this.agility = agility;
        this.lucky = lucky;
        this.speed = speed;
    }
    private Double health;
    private Double health_regen;
    private Double mana;
    private Double mana_regen;
    private Double stamina;
    private Double stamina_regen;
    private Double physical_damage;
    private Double magical_damage;
    private Double defense;
    private Double mind;
    private Double attack_speed;
    private Double strength;
    private Double intelligence;
    private Double vitality;
    private Double dexterity;
    private Double agility;
    private Double lucky;
    private Double speed;

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Double getHealth_regen() {
        return health_regen;
    }

    public void setHealth_regen(Double health_regen) {
        this.health_regen = health_regen;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public Double getMana_regen() {
        return mana_regen;
    }

    public void setMana_regen(Double mana_regen) {
        this.mana_regen = mana_regen;
    }

    public Double getStamina() {
        return stamina;
    }

    public void setStamina(Double stamina) {
        this.stamina = stamina;
    }

    public Double getStamina_regen() {
        return stamina_regen;
    }

    public void setStamina_regen(Double stamina_regen) {
        this.stamina_regen = stamina_regen;
    }

    public Double getPhysical_damage() {
        return physical_damage;
    }

    public void setPhysical_damage(Double physical_damage) {
        this.physical_damage = physical_damage;
    }

    public Double getMagical_damage() {
        return magical_damage;
    }

    public void setMagical_damage(Double magical_damage) {
        this.magical_damage = magical_damage;
    }

    public Double getDefense() {
        return defense;
    }

    public void setDefense(Double defense) {
        this.defense = defense;
    }

    public Double getMind() {
        return mind;
    }

    public void setMind(Double mind) {
        this.mind = mind;
    }

    public Double getAttack_speed() {
        return attack_speed;
    }

    public void setAttack_speed(Double attack_speed) {
        this.attack_speed = attack_speed;
    }

    public Double getStrength() {
        return strength;
    }

    public void setStrength(Double strength) {
        this.strength = strength;
    }

    public Double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Double intelligence) {
        this.intelligence = intelligence;
    }

    public Double getVitality() {
        return vitality;
    }

    public void setVitality(Double vitality) {
        this.vitality = vitality;
    }

    public Double getDexterity() {
        return dexterity;
    }

    public void setDexterity(Double dexterity) {
        this.dexterity = dexterity;
    }

    public Double getAgility() {
        return agility;
    }

    public void setAgility(Double agility) {
        this.agility = agility;
    }

    public Double getLucky() {
        return lucky;
    }

    public void setLucky(Double lucky) {
        this.lucky = lucky;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}