//    Openbravo POS is a point of sales application designed for touch screens.
//    Copyright (C) 2007-2009 Openbravo, S.L.
//    http://www.openbravo.com/product/pos
//
//    This file is part of Openbravo POS.
//
//    Openbravo POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Openbravo POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Openbravo POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.beans;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    
    /** Creates a new instance of DateUtils */
    private DateUtils() {
    }
    
    public static Date getToday() { 
        // el dia de hoy sin horas ni nada.        
        return getToday(new Date());     
    }
    
    public static Date getToday(Date d) { 
        // el dia de hoy sin horas ni nada.        
//        GregorianCalendar ddate = new GregorianCalendar();
        JalaliCalendar ddate = new JalaliCalendar();
        ddate.setTime(d);    
//        GregorianCalendar ddateday = new GregorianCalendar(ddate.get(GregorianCalendar.YEAR), ddate.get(GregorianCalendar.MONTH), ddate.get(GregorianCalendar.DAY_OF_MONTH));
       JalaliCalendar ddateday = new JalaliCalendar(ddate.get(JalaliCalendar.YEAR), ddate.get(JalaliCalendar.MONTH), ddate.get(JalaliCalendar.DAY_OF_MONTH)); 
        return ddateday.getTime();        
    }
    
    public static Date getTodayMinutes() { 
        // el dia de hoy sin horas ni nada.        
        return getTodayMinutes(new Date());     
    }
    
    public static Date getTodayMinutes(Date d) { 
        // el dia de hoy sin horas ni nada.        
//        GregorianCalendar ddate = new GregorianCalendar();
        JalaliCalendar ddate = new JalaliCalendar();
        ddate.setTime(d);    
        JalaliCalendar ddateday = new JalaliCalendar(ddate.get(JalaliCalendar.YEAR), ddate.get(JalaliCalendar.MONTH), ddate.get(JalaliCalendar.DAY_OF_MONTH)
                                                         , ddate.get(JalaliCalendar.HOUR_OF_DAY), ddate.get(JalaliCalendar.MINUTE));
        return ddateday.getTime();        
    }
    
    public static Date getTodayHours(Date d) {
        // el dia ajustado a las horeas     
        JalaliCalendar ddate = new JalaliCalendar();
        ddate.setTime(d);    
        
        JalaliCalendar dNow = new JalaliCalendar();
        dNow.clear();
        dNow.set(ddate.get(JalaliCalendar.YEAR), ddate.get(JalaliCalendar.MONTH), ddate.get(JalaliCalendar.DAY_OF_MONTH)
               , ddate.get(JalaliCalendar.HOUR_OF_DAY), 0, 0);
        
        return dNow.getTime();        
    }
    
    public static Date getDate(Date day, Date hour) {
        
        // Calculamos el dia actual con la hora escogida.
        JalaliCalendar dDay = new JalaliCalendar();
        dDay.setTime(day);
        JalaliCalendar dHour = new JalaliCalendar();
        dHour.setTime(hour);    
        
        JalaliCalendar dNow = new JalaliCalendar();
        dNow.clear();
        dNow.set(dDay.get(JalaliCalendar.YEAR), dDay.get(JalaliCalendar.MONTH), dDay.get(JalaliCalendar.DAY_OF_MONTH)
        , dHour.get(JalaliCalendar.HOUR_OF_DAY), dHour.get(JalaliCalendar.MINUTE), dHour.get(JalaliCalendar.SECOND));
        
        return dNow.getTime();
    }
 
}
