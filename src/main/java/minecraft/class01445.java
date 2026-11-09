package minecraft;

import java.util.UUID;

public class class01445 {
   private static final String[] N = new String[]{
      "Slim",
      "Far",
      "River",
      "Silly",
      "Fat",
      "Thin",
      "Fish",
      "Bat",
      "Dark",
      "Oak",
      "Sly",
      "Bush",
      "Zen",
      "Bark",
      "Cry",
      "Slack",
      "Soup",
      "Grim",
      "Hook",
      "Dirt",
      "Mud",
      "Sad",
      "Hard",
      "Crook",
      "Sneak",
      "Stink",
      "Weird",
      "Fire",
      "Soot",
      "Soft",
      "Rough",
      "Cling",
      "Scar"
   };
   private static final String[] y = new String[]{
      "Fox",
      "Tail",
      "Jaw",
      "Whisper",
      "Twig",
      "Root",
      "Finder",
      "Nose",
      "Brow",
      "Blade",
      "Fry",
      "Seek",
      "Wart",
      "Tooth",
      "Foot",
      "Leaf",
      "Stone",
      "Fall",
      "Face",
      "Tongue",
      "Voice",
      "Lip",
      "Mouth",
      "Snail",
      "Toe",
      "Ear",
      "Hair",
      "Beard",
      "Shirt",
      "Fist"
   };

   public class01445() {
      super();
   }

   private static class06069 y(UUID var0) {
      return class06069.y((long)(var0.hashCode() >> 2));
   }

   private static String N(class06069 var0, String[] var1) {
      return class07536.N((String[])var1, var0);
   }

   public static String N(UUID var0) {
      class06069 class06069 = y(var0);
      return N(class06069, N) + N(class06069, y);
   }

   public static String N(class07049 var0) {
      if (var0 instanceof class08036) {
         return var0.method_74861();
      } else {
         class00392 class00392 = var0.method_5797();
         return class00392 != null ? class00392.getString() : N(var0.method_5667());
      }
   }
}
