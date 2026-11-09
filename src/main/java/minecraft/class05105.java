package minecraft;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class class05105 {
   public class05105() {
      super();
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder("{");

      for (Field field : this.getClass().getFields()) {
         if (!y(field)) {
            try {
               stringbuilder.append(N(field)).append("=").append(field.get(this)).append(" ");
            } catch (IllegalAccessException illegalaccessexception) {
            }
         }
      }

      stringbuilder.deleteCharAt(stringbuilder.length() - 1);
      stringbuilder.append('}');
      return stringbuilder.toString();
   }

   private static boolean y(Field var0) {
      return Modifier.isStatic(var0.getModifiers());
   }

   private static String N(Field var0) {
      SerializedName serializedname = var0.getAnnotation(SerializedName.class);
      return serializedname != null ? serializedname.value() : var0.getName();
   }
}
