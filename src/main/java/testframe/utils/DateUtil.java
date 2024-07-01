package testframe.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public String getDateInyyyyMMddhhmmssFormat(){
        return new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
    }

}
