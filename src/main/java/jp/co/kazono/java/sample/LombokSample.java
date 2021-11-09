package jp.co.kazono.java.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LombokSample {
    private String Name;
    private int id;

    public static void main(String[] args) {
        LombokSample sample = new LombokSample("kazono", 0);
        log.info("name: {}, id: {}", sample.getName(), sample.getId());

        LombokSample sample2 = new LombokSample();
        sample2.setName("kazono1990");
        sample2.setId(1);
        log.info("name: {}, id: {}", sample2.getName(), sample2.getId());
    }
}
