package org.example;


import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Number {
    private int index;
    private int number;

    @Override
    public boolean equals(Object o) {
        // check if same position in memory, if so return true
        if (o == this) {
            return true;
        }
        // check if they are the same class, if not return false
        if (!(o instanceof Number)) {
            return false;
        }

        // typecast for some reason?
        Number c = (Number) o;

        // Compare the data members and return accordingly
        return this.number == c.getNumber();

    }

    @Override
    public int hashCode() {
        // override hashcode method to only consider number value, ignore index
        int result = 17;
        result = 31 * result + number;
        return result;
    }
}

