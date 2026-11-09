package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class08496 {
   public static final class08496 field_57012 = new class08496(List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
   private final List<class02022> field_57013;
   private final List<class02022> field_57014;
   private final List<class02022> field_57015;
   private final List<class02022> field_57016;
   private final List<class02022> field_57017;
   private final List<class02022> field_57018;
   private final List<class02022> field_57019;
   private final List<class02022> field_57020;

   public class08496(
      List<class02022> var1,
      List<class02022> var2,
      List<class02022> var3,
      List<class02022> var4,
      List<class02022> var5,
      List<class02022> var6,
      List<class02022> var7,
      List<class02022> var8
   ) {
      super();
      this.field_57013 = var1;
      this.field_57014 = var2;
      this.field_57015 = var3;
      this.field_57016 = var4;
      this.field_57017 = var5;
      this.field_57018 = var6;
      this.field_57019 = var7;
      this.field_57020 = var8;
   }

   public List<class02022> method_68049(@Nullable class07211 var1) {
      return switch (var1) {
         case null -> this.field_57014;
         case NORTH -> this.field_57015;
         case SOUTH -> this.field_57016;
         case EAST -> this.field_57017;
         case WEST -> this.field_57018;
         case UP -> this.field_57019;
         case DOWN -> this.field_57020;
         default -> throw new MatchException(null, null);
      };
   }

   public List<class02022> method_68048() {
      return this.field_57013;
   }
}
