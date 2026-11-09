package minecraft;

import com.mojang.serialization.Codec;

public enum class06535 implements class05033 {
   field_64525("never", "options.musicToast.never"),
   field_64526("pause", "options.musicToast.pauseMenu"),
   field_64527("pause_and_toast", "options.musicToast.pauseMenuAndToast");

   public static final Codec<class06535> field_64528 = class05033.N(class06535::values);
   private final String field_64529;
   private final class00392 field_64530;
   private final class00392 field_64531;

   public boolean L() {
      return this != field_64525;
   }

   private class06535(String var3, String var4) {
      this.field_64529 = var3;
      this.field_64530 = class00392.L(var4);
      this.field_64531 = class00392.L(var4 + ".tooltip");
   }

   public boolean u() {
      return this == field_64527;
   }

   public class00392 y() {
      return this.field_64531;
   }

   public class00392 N() {
      return this.field_64530;
   }

   @Override
   public String method_15434() {
      return this.field_64529;
   }
}
