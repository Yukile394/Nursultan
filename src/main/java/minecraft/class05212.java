package minecraft;

import java.util.Locale;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public interface class05212 extends class05207 {
   void L(int var1);

   void L(boolean var1);

   int M();

   @Deprecated
   Optional<class08074> P();

   int Z();

   int i();

   void i(int var1);

   class00754<class02796> b();

   @Nullable
   UUID n();

   class07305 m();

   int v();

   int j();

   class07282 z();

   @Override
   String u();

   void u(int var1);

   void y(int var1);

   void y(long var1);

   boolean E();

   void N(class07282 var1);

   void N(long var1);

   @Override
   default void N(class07074 var1, class05474 var2) {
      class05207.super.N(var1, var2);
      var1.N("Level name", this::u);
      var1.N(
         "Level game mode",
         () -> String.format(Locale.ROOT, "Game mode: %s (ID %d). Hardcore: %b. Commands: %b", this.z().y(), this.z().N(), this.U(), this.E())
      );
      var1.N("Level weather", () -> String.format(Locale.ROOT, "Rain time: %d (now: %b), thunder time: %d (now: %b)", this.Z(), this.B(), this.M(), this.R()));
   }

   void N(boolean var1);

   void N(UUID var1);

   @Deprecated
   void N(Optional<class08074> var1);

   void N(int var1);

   boolean W();
}
