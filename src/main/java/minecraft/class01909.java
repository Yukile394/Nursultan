package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class class01909 implements AutoCloseable {
   private final Long2ObjectOpenHashMap<class01916> field_37953 = new Long2ObjectOpenHashMap();
   private int field_37954;
   private boolean field_37955;

   public class01909() {
      super();
   }

   @Override
   public void close() {
      this.field_37955 = false;
   }

   public boolean method_41940(class07209 var1, class00500 var2) {
      class01916 class01916 = (class01916)this.field_37953.get(var1.method_10063());
      if (class01916 == null) {
         return false;
      } else {
         class01916.N(var2);
         return true;
      }
   }

   public void method_41938(int var1, class03448 var2) {
      ObjectIterator<Entry<class01916>> objectiterator = this.field_37953.long2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         class01916 class01916 = (class01916)entry.getValue();
         if (class01916.y <= var1) {
            class07209 class07209 = class07209.method_10092(entry.getLongKey());
            objectiterator.remove();
            var2.N(class07209, class01916.L, class01916.N);
         }
      }
   }

   public void method_41941(class07209 var1, class00500 var2, class04453 var3) {
      this.field_37953
         .compute(var1.method_10063(), (var3x, var4) -> var4 != null ? var4.N(this.field_37954) : new class01916(this.field_37954, var2, var3.method_73189()));
   }

   public boolean method_41943() {
      return this.field_37955;
   }

   public int method_41942() {
      return this.field_37954;
   }

   public class01909 method_41937() {
      this.field_37954++;
      this.field_37955 = true;
      return this;
   }
}
