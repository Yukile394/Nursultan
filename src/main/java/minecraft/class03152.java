package minecraft;

import java.util.List;

public record class03152(List<String> path, class01424<?> type, String name) {
   public String L() {
      return this.name;
   }

   public class03152(class01424<?> var1, String var2) {
      this(List.of(), var1, var2);
   }

   public class03152(List<String> path, class01424<?> type, String name) {
      super();
      this.path = path;
      this.type = type;
      this.name = name;
   }

   public class03152(String var1, String var2, class01424<?> var3, String var4) {
      this(List.of(var1, var2), var3, var4);
   }

   public class03152(String var1, class01424<?> var2, String var3) {
      this(List.of(var1), var2, var3);
   }

   public class01424<?> y() {
      return this.type;
   }

   public List<String> N() {
      return this.path;
   }
}
