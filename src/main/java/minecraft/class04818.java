package minecraft;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class class04818 implements class04836 {
   private static final Pattern N = Pattern.compile("[A-Za-z._]+[A-Za-z0-9._+-]*");
   private final StringBuilder y = new StringBuilder();

   public class04818() {
      super();
   }

   @Override
   public void N(class07741 var1) {
      this.y.append('[');

      for (int i = 0; i < var1.size(); i++) {
         if (i != 0) {
            this.y.append(',');
         }

         var1.get(i).N(this);
      }

      this.y.append(']');
   }

   @Override
   public void N(class07757 var1) {
      this.y.append("[L;");
      long[] along = var1.M();

      for (int i = 0; i < along.length; i++) {
         if (i != 0) {
            this.y.append(',');
         }

         this.y.append(along[i]).append('L');
      }

      this.y.append(']');
   }

   @Override
   public void N(class06995 var1) {
      this.y.append("[I;");
      int[] aint = var1.M();

      for (int i = 0; i < aint.length; i++) {
         if (i != 0) {
            this.y.append(',');
         }

         this.y.append(aint[i]);
      }

      this.y.append(']');
   }

   @Override
   public void N(class07029 var1) {
      this.y.append("[B;");
      byte[] abyte = var1.i();

      for (int i = 0; i < abyte.length; i++) {
         if (i != 0) {
            this.y.append(',');
         }

         this.y.append(abyte[i]).append('B');
      }

      this.y.append(']');
   }

   @Override
   public void N(class07019 var1) {
      this.y.append(var1.m()).append('d');
   }

   @Override
   public void N(class06997 var1) {
      this.y.append("END");
   }

   private void N(String var1) {
      if (!var1.equalsIgnoreCase("true") && !var1.equalsIgnoreCase("false") && N.matcher(var1).matches()) {
         this.y.append(var1);
      } else {
         class07707.N(var1, this.y);
      }
   }

   @Override
   public void N(class07001 var1) {
      this.y.append('{');
      ArrayList arraylist = new ArrayList<>(var1.M());
      arraylist.sort(Entry.comparingByKey());

      for (int i = 0; i < arraylist.size(); i++) {
         Entry entry = (Entry)arraylist.get(i);
         if (i != 0) {
            this.y.append(',');
         }

         this.N((String)entry.getKey());
         this.y.append(':');
         ((class07709)entry.getValue()).N(this);
      }

      this.y.append('}');
   }

   @Override
   public void N(class07720 var1) {
      this.y.append(var1.m());
   }

   @Override
   public void N(class07730 var1) {
      this.y.append(var1.m()).append('s');
   }

   @Override
   public void N(class07037 var1) {
      this.y.append(var1.m()).append('b');
   }

   @Override
   public void N(class07707 var1) {
      this.y.append(class07707.y(var1.U()));
   }

   @Override
   public void N(class07729 var1) {
      this.y.append(var1.m()).append('L');
   }

   @Override
   public void N(class07009 var1) {
      this.y.append(var1.m()).append('f');
   }

   public String N() {
      return this.y.toString();
   }
}
