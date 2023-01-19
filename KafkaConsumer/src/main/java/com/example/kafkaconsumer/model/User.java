package com.example.kafkaconsumer.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Builder
@Getter
@ToString
public class User implements Serializable {
    public static long serialVersionUID = 101010;
    private Long userId;
}
