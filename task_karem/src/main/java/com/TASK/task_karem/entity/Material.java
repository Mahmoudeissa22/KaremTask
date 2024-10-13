package com.TASK.task_karem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "material_Name")
    private String materialName;

    @Column(name = "user_Id")
    private int userId;

    public Material() {
    }

    public Material(String materialName, int userId) {
        this.materialName = materialName;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", materialName='" + materialName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
