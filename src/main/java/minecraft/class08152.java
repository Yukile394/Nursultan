package minecraft;

public interface class08152 {
   class08152 M = var0 -> false;
   class08152 B = var0 -> true;

   default class08152 N(class08152 var1) {
      return (class08152)(var1 instanceof class07569 ? var1.N(this) : new class07569(this, var1));
   }

   boolean hasPermission(class08159 var1);
}
