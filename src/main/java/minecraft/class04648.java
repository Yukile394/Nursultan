package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Locale;
import java.util.function.BiFunction;
import org.lwjgl.glfw.GLFW;

public enum class04648 {
   field_1668("key.keyboard", (var0, var1) -> {
      if ("key.keyboard.unknown".equals(var1)) {
         return class00392.L(var1);
      } else {
         String s = GLFW.glfwGetKeyName(var0, -1);
         return s != null ? class00392.y(s.toUpperCase(Locale.ROOT)) : class00392.L(var1);
      }
   }),
   field_1671("scancode", (var0, var1) -> {
      String s = GLFW.glfwGetKeyName(-1, var0);
      return s != null ? class00392.y(s) : class00392.L(var1);
   }),
   field_1672("key.mouse", (var0, var1) -> class07018.y().N(var1) ? class00392.L(var1) : class00392.N("key.mouse", var0 + 1));

   private static final String field_44919 = "key.keyboard.unknown";
   private final Int2ObjectMap<class04671> field_1674 = new Int2ObjectOpenHashMap();
   final String field_1673;
   final BiFunction<Integer, String, class00392> field_24197;

   private class04648(String var3, BiFunction<Integer, String, class00392> var4) {
      this.field_1673 = var3;
      this.field_24197 = var4;
   }

   public class04671 N(int var1) {
      return (class04671)this.field_1674.computeIfAbsent(var1, var1x -> {
         int i = var1x;
         if (this == field_1672) {
            i = var1x + 1;
         }

         String s = this.field_1673 + "." + i;
         return new class04671(s, this, var1x);
      });
   }

   private static void N(class04648 var0, String var1, int var2) {
      class04671 class04671 = new class04671(var1, var0, var2);
      var0.field_1674.put(var2, class04671);
   }

   static {
      N(field_1668, "key.keyboard.unknown", -1);
      N(field_1672, "key.mouse.left", 0);
      N(field_1672, "key.mouse.right", 1);
      N(field_1672, "key.mouse.middle", 2);
      N(field_1672, "key.mouse.4", 3);
      N(field_1672, "key.mouse.5", 4);
      N(field_1672, "key.mouse.6", 5);
      N(field_1672, "key.mouse.7", 6);
      N(field_1672, "key.mouse.8", 7);
      N(field_1668, "key.keyboard.0", 48);
      N(field_1668, "key.keyboard.1", 49);
      N(field_1668, "key.keyboard.2", 50);
      N(field_1668, "key.keyboard.3", 51);
      N(field_1668, "key.keyboard.4", 52);
      N(field_1668, "key.keyboard.5", 53);
      N(field_1668, "key.keyboard.6", 54);
      N(field_1668, "key.keyboard.7", 55);
      N(field_1668, "key.keyboard.8", 56);
      N(field_1668, "key.keyboard.9", 57);
      N(field_1668, "key.keyboard.a", 65);
      N(field_1668, "key.keyboard.b", 66);
      N(field_1668, "key.keyboard.c", 67);
      N(field_1668, "key.keyboard.d", 68);
      N(field_1668, "key.keyboard.e", 69);
      N(field_1668, "key.keyboard.f", 70);
      N(field_1668, "key.keyboard.g", 71);
      N(field_1668, "key.keyboard.h", 72);
      N(field_1668, "key.keyboard.i", 73);
      N(field_1668, "key.keyboard.j", 74);
      N(field_1668, "key.keyboard.k", 75);
      N(field_1668, "key.keyboard.l", 76);
      N(field_1668, "key.keyboard.m", 77);
      N(field_1668, "key.keyboard.n", 78);
      N(field_1668, "key.keyboard.o", 79);
      N(field_1668, "key.keyboard.p", 80);
      N(field_1668, "key.keyboard.q", 81);
      N(field_1668, "key.keyboard.r", 82);
      N(field_1668, "key.keyboard.s", 83);
      N(field_1668, "key.keyboard.t", 84);
      N(field_1668, "key.keyboard.u", 85);
      N(field_1668, "key.keyboard.v", 86);
      N(field_1668, "key.keyboard.w", 87);
      N(field_1668, "key.keyboard.x", 88);
      N(field_1668, "key.keyboard.y", 89);
      N(field_1668, "key.keyboard.z", 90);
      N(field_1668, "key.keyboard.f1", 290);
      N(field_1668, "key.keyboard.f2", 291);
      N(field_1668, "key.keyboard.f3", 292);
      N(field_1668, "key.keyboard.f4", 293);
      N(field_1668, "key.keyboard.f5", 294);
      N(field_1668, "key.keyboard.f6", 295);
      N(field_1668, "key.keyboard.f7", 296);
      N(field_1668, "key.keyboard.f8", 297);
      N(field_1668, "key.keyboard.f9", 298);
      N(field_1668, "key.keyboard.f10", 299);
      N(field_1668, "key.keyboard.f11", 300);
      N(field_1668, "key.keyboard.f12", 301);
      N(field_1668, "key.keyboard.f13", 302);
      N(field_1668, "key.keyboard.f14", 303);
      N(field_1668, "key.keyboard.f15", 304);
      N(field_1668, "key.keyboard.f16", 305);
      N(field_1668, "key.keyboard.f17", 306);
      N(field_1668, "key.keyboard.f18", 307);
      N(field_1668, "key.keyboard.f19", 308);
      N(field_1668, "key.keyboard.f20", 309);
      N(field_1668, "key.keyboard.f21", 310);
      N(field_1668, "key.keyboard.f22", 311);
      N(field_1668, "key.keyboard.f23", 312);
      N(field_1668, "key.keyboard.f24", 313);
      N(field_1668, "key.keyboard.f25", 314);
      N(field_1668, "key.keyboard.num.lock", 282);
      N(field_1668, "key.keyboard.keypad.0", 320);
      N(field_1668, "key.keyboard.keypad.1", 321);
      N(field_1668, "key.keyboard.keypad.2", 322);
      N(field_1668, "key.keyboard.keypad.3", 323);
      N(field_1668, "key.keyboard.keypad.4", 324);
      N(field_1668, "key.keyboard.keypad.5", 325);
      N(field_1668, "key.keyboard.keypad.6", 326);
      N(field_1668, "key.keyboard.keypad.7", 327);
      N(field_1668, "key.keyboard.keypad.8", 328);
      N(field_1668, "key.keyboard.keypad.9", 329);
      N(field_1668, "key.keyboard.keypad.add", 334);
      N(field_1668, "key.keyboard.keypad.decimal", 330);
      N(field_1668, "key.keyboard.keypad.enter", 335);
      N(field_1668, "key.keyboard.keypad.equal", 336);
      N(field_1668, "key.keyboard.keypad.multiply", 332);
      N(field_1668, "key.keyboard.keypad.divide", 331);
      N(field_1668, "key.keyboard.keypad.subtract", 333);
      N(field_1668, "key.keyboard.down", 264);
      N(field_1668, "key.keyboard.left", 263);
      N(field_1668, "key.keyboard.right", 262);
      N(field_1668, "key.keyboard.up", 265);
      N(field_1668, "key.keyboard.apostrophe", 39);
      N(field_1668, "key.keyboard.backslash", 92);
      N(field_1668, "key.keyboard.comma", 44);
      N(field_1668, "key.keyboard.equal", 61);
      N(field_1668, "key.keyboard.grave.accent", 96);
      N(field_1668, "key.keyboard.left.bracket", 91);
      N(field_1668, "key.keyboard.minus", 45);
      N(field_1668, "key.keyboard.period", 46);
      N(field_1668, "key.keyboard.right.bracket", 93);
      N(field_1668, "key.keyboard.semicolon", 59);
      N(field_1668, "key.keyboard.slash", 47);
      N(field_1668, "key.keyboard.space", 32);
      N(field_1668, "key.keyboard.tab", 258);
      N(field_1668, "key.keyboard.left.alt", 342);
      N(field_1668, "key.keyboard.left.control", 341);
      N(field_1668, "key.keyboard.left.shift", 340);
      N(field_1668, "key.keyboard.left.win", 343);
      N(field_1668, "key.keyboard.right.alt", 346);
      N(field_1668, "key.keyboard.right.control", 345);
      N(field_1668, "key.keyboard.right.shift", 344);
      N(field_1668, "key.keyboard.right.win", 347);
      N(field_1668, "key.keyboard.enter", 257);
      N(field_1668, "key.keyboard.escape", 256);
      N(field_1668, "key.keyboard.backspace", 259);
      N(field_1668, "key.keyboard.delete", 261);
      N(field_1668, "key.keyboard.end", 269);
      N(field_1668, "key.keyboard.home", 268);
      N(field_1668, "key.keyboard.insert", 260);
      N(field_1668, "key.keyboard.page.down", 267);
      N(field_1668, "key.keyboard.page.up", 266);
      N(field_1668, "key.keyboard.caps.lock", 280);
      N(field_1668, "key.keyboard.pause", 284);
      N(field_1668, "key.keyboard.scroll.lock", 281);
      N(field_1668, "key.keyboard.menu", 348);
      N(field_1668, "key.keyboard.print.screen", 283);
      N(field_1668, "key.keyboard.world.1", 161);
      N(field_1668, "key.keyboard.world.2", 162);
   }
}
