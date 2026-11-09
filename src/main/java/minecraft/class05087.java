package minecraft;

import java.util.Locale;

public interface class05087 {
   long L();

   boolean T();

   boolean B();

   class07086 s();

   boolean U();

   long y();

   void y(boolean var1);

   default void N(class07074 var1, class05474 var2) {
      var1.N("Level spawn location", () -> class07074.N(var2, this.N().y()));
      var1.N("Level time", () -> String.format(Locale.ROOT, "%d game time, %d day time", this.y(), this.L()));
   }

   class05042 N();

   boolean R();
}
