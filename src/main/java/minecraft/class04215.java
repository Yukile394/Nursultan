package minecraft;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import org.jspecify.annotations.Nullable;

public record class04215(LocalDate date, int index) {
   private static final DateTimeFormatter L = DateTimeFormatter.BASIC_ISO_DATE;

   public class04215(LocalDate date, int index) {
      this.date = date;
      this.index = index;
   }

   @Override
   public String toString() {
      return L.format(this.date) + "-" + this.index;
   }

   public int y() {
      return this.index;
   }

   public String y(String var1) {
      return this + var1;
   }

   @Nullable
   public static class04215 N(String var0) {
      int i = var0.indexOf("-");
      if (i == -1) {
         return null;
      } else {
         String s = var0.substring(0, i);
         String s1 = var0.substring(i + 1);

         try {
            return new class04215(LocalDate.parse(s, L), Integer.parseInt(s1));
         } catch (DateTimeParseException | NumberFormatException numberformatexception) {
            return null;
         }
      }
   }

   public LocalDate N() {
      return this.date;
   }
}
