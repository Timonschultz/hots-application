package nl.timonschultz.hots.persistence.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
public abstract class HasId<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private T id;
}