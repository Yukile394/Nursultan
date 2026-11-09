package minecraft;

import java.util.List;
import java.util.Optional;

public record class00560(int slot, List<String> pages, Optional<String> title) implements class00381<class08051> {
   public static final class02362<class00667, class00560> N = class02362.N(
      class02389.B,
      class00560::N,
      class02389.y(1024).N_33(class02389.L(100)),
      class00560::y,
      class02389.y(32).N_33(class02389::N),
      class00560::L,
      class00560::new
   );

   public Optional<String> L() {
      return this.title;
   }

   public class00560(int slot, List<String> pages, Optional<String> title) {
      pages = List.copyOf(pages);
      this.slot = slot;
      this.pages = pages;
      this.title = title;
   }

   public List<String> y() {
      return this.pages;
   }

   public void method_65081(class08051 var1) {
      var1.method_12053(this);
   }

   public int N() {
      return this.slot;
   }

   @Override
   public class02897<class00560> method_65080() {
      return class04248.yV;
   }
}
