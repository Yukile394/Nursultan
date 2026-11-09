package minecraft;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class class05494 {
   private static final char N = ' ';
   private static final char y = '_';
   private static final char L = '+';
   private static final char u = 'x';
   private static final char i = 'X';
   private final Collection<class05513> R = Lists.newArrayList();
   private final Collection<class05532> M = Lists.newArrayList();

   public int L() {
      return (int)this.R.stream().filter(class05513::U).count();
   }

   public Collection<class05513> M() {
      return this.R.stream().filter(class05513::Z).filter(class05513::j).collect(Collectors.toList());
   }

   public class05494() {
      super();
   }

   public class05494(Collection<class05513> var1) {
      super();
      this.R.addAll(var1);
   }

   @Override
   public String toString() {
      return this.z();
   }

   public int B() {
      return this.R.size();
   }

   public boolean Z() {
      return this.L() == this.B();
   }

   public boolean i() {
      return this.y() > 0;
   }

   public String z() {
      StringBuffer stringbuffer = new StringBuffer();
      stringbuffer.append('[');
      this.R.forEach(var1x -> {
         if (!var1x.z()) {
            stringbuffer.append(' ');
         } else if (var1x.B()) {
            stringbuffer.append('+');
         } else if (var1x.Z()) {
            stringbuffer.append((char)(var1x.b() ? 'X' : 'x'));
         } else {
            stringbuffer.append('_');
         }
      });
      stringbuffer.append(']');
      return stringbuffer.toString();
   }

   public boolean u() {
      return this.N() > 0;
   }

   public void y(class05513 var1) {
      this.R.remove(var1);
   }

   public int y() {
      return (int)this.R.stream().filter(class05513::Z).filter(class05513::j).count();
   }

   public void N(class05513 var1) {
      this.R.add(var1);
      this.M.forEach(var1::N);
   }

   public int N() {
      return (int)this.R.stream().filter(class05513::Z).filter(class05513::b).count();
   }

   public void N(Consumer<class05513> var1) {
      this.N(new class05505(this, var1));
   }

   public void N(class05532 var1) {
      this.M.add(var1);
      this.R.forEach(var1x -> var1x.N(var1));
   }

   public Collection<class05513> R() {
      return this.R.stream().filter(class05513::Z).filter(class05513::b).collect(Collectors.toList());
   }
}
