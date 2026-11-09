package minecraft;

import java.util.HashMap;
import java.util.Map;

public record class03173(int depth, Map<String, class01424<?>> selectedFields, Map<String, class03173> fieldsToRecurse) {
   public Map<String, class01424<?>> L() {
      return this.selectedFields;
   }

   private class03173(int var1) {
      this(var1, new HashMap<>(), new HashMap<>());
   }

   public class03173(int depth, Map<String, class01424<?>> selectedFields, Map<String, class03173> fieldsToRecurse) {
      this.depth = depth;
      this.selectedFields = selectedFields;
      this.fieldsToRecurse = fieldsToRecurse;
   }

   public Map<String, class03173> u() {
      return this.fieldsToRecurse;
   }

   public int y() {
      return this.depth;
   }

   public static class03173 N() {
      return new class03173(1);
   }

   public void N(class03152 var1) {
      if (this.depth <= var1.N().size()) {
         this.fieldsToRecurse.computeIfAbsent(var1.N().get(this.depth - 1), var1x -> new class03173(this.depth + 1)).N(var1);
      } else {
         this.selectedFields.put(var1.L(), var1.y());
      }
   }

   public boolean N(class01424<?> var1, String var2) {
      return var1.equals(this.L().get(var2));
   }
}
