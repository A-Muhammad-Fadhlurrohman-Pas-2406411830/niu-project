package id.ac.ui.cs.advprog.niuproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class BaseProduct {
    private String id;
    private String name;
    private int quantity;
}
