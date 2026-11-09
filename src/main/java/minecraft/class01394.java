package minecraft;

public enum class01394 {
   field_2701(
      class01894.y("advancements/box_obtained"),
      class01894.y("advancements/task_frame_obtained"),
      class01894.y("advancements/challenge_frame_obtained"),
      class01894.y("advancements/goal_frame_obtained")
   ),
   field_2699(
      class01894.y("advancements/box_unobtained"),
      class01894.y("advancements/task_frame_unobtained"),
      class01894.y("advancements/challenge_frame_unobtained"),
      class01894.y("advancements/goal_frame_unobtained")
   );

   private final class01894 field_45426;
   private final class01894 field_45427;
   private final class01894 field_45428;
   private final class01894 field_45429;

   private class01394(class01894 var3, class01894 var4, class01894 var5, class01894 var6) {
      this.field_45426 = var3;
      this.field_45427 = var4;
      this.field_45428 = var5;
      this.field_45429 = var6;
   }

   public class01894 N(class07296 var1) {
      return switch (var1) {
         case field_1254 -> this.field_45427;
         case field_1250 -> this.field_45428;
         case field_1249 -> this.field_45429;
      };
   }

   public class01894 N() {
      return this.field_45426;
   }
}
