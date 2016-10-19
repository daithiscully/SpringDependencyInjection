package writer;

import org.springframework.stereotype.Service;

@Service
public class CustomWriter implements IWriter {
    public void writer(String s) {
        System.out.println("I would like to bring to your attention: " + s);
    }
} 