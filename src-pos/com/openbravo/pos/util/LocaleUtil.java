
package com.openbravo.pos.util;

import java.awt.Component;
import java.awt.ComponentOrientation;
import java.util.Locale;



/**
 * 
 * @author Omid Pourhadi Email : omidpourhadi AT gmail DOT com
 * 
 */
public final class LocaleUtil {

	public static Locale getIranLocale() {
		return new Locale(IranConstants.LOCALE_LANGUAGE,
				IranConstants.LOCALE_COUNTRY);
	}

	public static boolean isIranLocale() {
		return Locale.getDefault().equals(getIranLocale());
	}

	public static boolean isIranLocale(Locale loc) {
		return loc.equals(getIranLocale());
	}

	public  static void applyComponentOrientation(Component... components) {
		for (Component component : components) {
			component.setComponentOrientation(ComponentOrientation
					.getOrientation(Locale.getDefault()));
		}
	}

}
