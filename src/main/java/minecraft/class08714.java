package minecraft;

import Nursultan.class10463;
import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import com.mojang.logging.LogUtils;
import java.lang.StackWalker.Option;
import java.lang.StackWalker.StackFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class08714 implements class04643 {
   private static final Logger N = LogUtils.getLogger();
   private static final StackWalker L = StackWalker.getInstance(Set.of(Option.RETAIN_CLASS_REFERENCE), 5);
   private final List<Zone> u = new ArrayList<>();
   private final Map<String, class08693> i = new HashMap<>();
   private final String R = Thread.currentThread().getName();

   @Override
   public void L() {
      if (this.u.isEmpty()) {
         N.error("Tried to pop one too many times! Mismatched push() and pop()?");
      } else {
         this.u.removeLast().close();
      }
   }

   @Override
   public void L(String var1) {
      this.u().addText(var1);
   }

   public class08714() {
      super();
   }

   private Zone u() {
      return this.u.getLast();
   }

   @Override
   public void y() {
      Iterator<class08693> iterator = this.i.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().N(0);
      }
   }

   @Override
   public void y(Supplier<String> var1) {
      this.L();
      this.N((String)var1.get());
   }

   @Override
   public void y(String var1) {
      this.L();
      this.N(var1);
   }

   @Override
   public void N(int var1) {
      this.u().setColor(var1);
   }

   @Override
   public void N(long var1) {
      this.u().addValue(var1);
   }

   @Override
   public void N(String var1, int var2) {
      this.i.computeIfAbsent(var1, var2x -> new class08693(this.R + " " + var1)).y(var2);
   }

   @Override
   public void N(String var1) {
      String s = "";
      String s1 = "";
      int ix = 0;
      if (class07529.ND) {
         Optional optional = L.walk(
            var0 -> var0.filter(var0x -> var0x.getDeclaringClass() != class08714.class && var0x.getDeclaringClass() != class10463.class).findFirst()
         );
         if (optional.isPresent()) {
            StackFrame stackframe = (StackFrame)optional.get();
            s = stackframe.getMethodName();
            s1 = stackframe.getFileName();
            ix = stackframe.getLineNumber();
         }
      }

      Zone zone = TracyClient.beginZone(var1, s, s1, ix);
      this.u.add(zone);
   }

   @Override
   public void N(class02253 var1) {
   }

   @Override
   public void N(Supplier<String> var1, int var2) {
      this.N((String)var1.get(), var2);
   }

   @Override
   public void N(Supplier<String> var1) {
      this.N((String)var1.get());
   }

   @Override
   public void N() {
   }
}
