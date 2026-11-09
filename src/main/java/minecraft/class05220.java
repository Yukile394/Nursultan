package minecraft;

import java.util.Arrays;
import java.util.Collection;

public class class05220 {
   public static final class00392 N = class00392.i();
   public static final class00392 y = class00392.L("options.on");
   public static final class00392 L = class00392.L("options.off");
   public static final class00392 u = class00392.L("gui.done");
   public static final class00392 i = class00392.L("gui.cancel");
   public static final class00392 R = class00392.L("gui.yes");
   public static final class00392 M = class00392.L("gui.no");
   public static final class00392 B = class00392.L("gui.ok");
   public static final class00392 Z = class00392.L("gui.proceed");
   public static final class00392 z = class00392.L("gui.continue");
   public static final class00392 U = class00392.L("gui.back");
   public static final class00392 E = class00392.L("gui.toTitle");
   public static final class00392 W = class00392.L("gui.acknowledge");
   public static final class00392 m = class00392.L("chat.link.open");
   public static final class00392 P = class00392.L("chat.copy");
   public static final class00392 s = class00392.L("gui.copy_link_to_clipboard");
   public static final class00392 T = class00392.L("menu.disconnect");
   public static final class00392 b = class00392.L("menu.returnToMenu");
   public static final class00392 j = class00392.L("connect.failed.transfer");
   public static final class00392 v = class00392.L("connect.failed");
   public static final class00392 n = class00392.y("\n");
   public static final class00392 t = class00392.y(". ");
   public static final class00392 G = class00392.y("...");
   public static final class00392 l = N();

   public static class05216 L(long var0) {
      return class00392.N("gui.minutes", var0);
   }

   public class05220() {
      super();
   }

   public static class00392 y(class00392... var0) {
      return N(Arrays.asList(var0));
   }

   public static class00392 y(boolean var0) {
      return var0 ? b : T;
   }

   public static class05216 y(long var0) {
      return class00392.N("gui.hours", var0);
   }

   public static class05216 N(class00392... var0) {
      class05216 class05216 = class00392.i();

      for (int ix = 0; ix < var0.length; ix++) {
         class05216.y(var0[ix]);
         if (ix != var0.length - 1) {
            class05216.y(t);
         }
      }

      return class05216;
   }

   public static class05216 N(class00392 var0, class00392 var1) {
      return class00392.N("options.generic_value", var0, var1);
   }

   public static class00392 N(Collection<? extends class00392> var0) {
      return class00390.N(var0, n);
   }

   public static class00392 N(boolean var0) {
      return var0 ? y : L;
   }

   public static class05216 N() {
      return class00392.y(" ");
   }

   public static class05216 N(class00392 var0, boolean var1) {
      return class00392.N(var1 ? "options.on.composed" : "options.off.composed", var0);
   }

   public static class05216 N(long var0) {
      return class00392.N("gui.days", var0);
   }
}
