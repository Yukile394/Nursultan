package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public record class01737(List<String> segments, List<String> variables) {
   public class01737(List<String> segments, List<String> variables) {
      this.segments = segments;
      this.variables = variables;
   }

   public List<String> y() {
      return this.variables;
   }

   public static boolean y(String var0) {
      for (int i = 0; i < var0.length(); i++) {
         char c0 = var0.charAt(i);
         if (!Character.isLetterOrDigit(c0) && c0 != '_') {
            return false;
         }
      }

      return true;
   }

   public String N(List<String> var1) {
      StringBuilder stringbuilder = new StringBuilder();

      for (int i = 0; i < this.variables.size(); i++) {
         stringbuilder.append(this.segments.get(i)).append((String)var1.get(i));
         class07684.N(stringbuilder);
      }

      if (this.segments.size() > this.variables.size()) {
         stringbuilder.append(this.segments.getLast());
      }

      class07684.N(stringbuilder);
      return stringbuilder.toString();
   }

   public List<String> N() {
      return this.segments;
   }

   public static class01737 N(String var0) {
      Builder builder = ImmutableList.builder();
      Builder builder1 = ImmutableList.builder();
      int i = var0.length();
      int j = 0;
      int k = var0.indexOf(36);

      while (k != -1) {
         if (k != i - 1 && var0.charAt(k + 1) == '(') {
            builder.add(var0.substring(j, k));
            int l = var0.indexOf(41, k + 1);
            if (l == -1) {
               throw new IllegalArgumentException("Unterminated macro variable");
            }

            String s = var0.substring(k + 2, l);
            if (!y(s)) {
               throw new IllegalArgumentException("Invalid macro variable name '" + s + "'");
            }

            builder1.add(s);
            j = l + 1;
            k = var0.indexOf(36, j);
         } else {
            k = var0.indexOf(36, k + 1);
         }
      }

      if (j == 0) {
         throw new IllegalArgumentException("No variables in macro");
      } else {
         if (j != i) {
            builder.add(var0.substring(j));
         }

         return new class01737(builder.build(), builder1.build());
      }
   }
}
