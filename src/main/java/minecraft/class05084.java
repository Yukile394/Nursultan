package minecraft;

import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.DynamicMBean;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class class05084 implements DynamicMBean {
   private static final Logger N = LogUtils.getLogger();
   private final class02796 y;
   private final MBeanInfo L;
   private final Map<String, class05072> u = Stream.of(
         new class05072("tickTimes", this::y, "Historical tick times (ms)", long[].class),
         new class05072("averageTickTime", this::N, "Current average tick time (ms)", long.class)
      )
      .collect(Collectors.toMap(var0 -> var0.N, Function.identity()));

   @Nullable
   @Override
   public Object invoke(String var1, Object[] var2, String[] var3) {
      return null;
   }

   private class05084(class02796 var1) {
      super();
      this.y = var1;
      MBeanAttributeInfo[] ambeanattributeinfo = this.u.values().stream().map(class05072::N).toArray(MBeanAttributeInfo[]::new);
      this.L = new MBeanInfo(class05084.class.getSimpleName(), "metrics for dedicated server", ambeanattributeinfo, null, null, new MBeanNotificationInfo[0]);
   }

   @Override
   public AttributeList getAttributes(String[] var1) {
      List list = Arrays.stream(var1).map(this.u::get).filter(Objects::nonNull).map(var0 -> new Attribute(var0.N, var0.y.get())).collect(Collectors.toList());
      return new AttributeList(list);
   }

   private long[] y() {
      return this.y.yP();
   }

   @Nullable
   @Override
   public Object getAttribute(String var1) {
      class05072 class05072 = this.u.get(var1);
      return class05072 == null ? null : class05072.y.get();
   }

   @Override
   public void setAttribute(Attribute var1) {
   }

   private float N() {
      return this.y.yE();
   }

   public static void N(class02796 var0) {
      try {
         ManagementFactory.getPlatformMBeanServer().registerMBean(new class05084(var0), new ObjectName("net.minecraft.server:type=Server"));
      } catch (InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException malformedobjectnameexception) {
         N.warn("Failed to initialise server as JMX bean", malformedobjectnameexception);
      }
   }

   @Override
   public MBeanInfo getMBeanInfo() {
      return this.L;
   }

   @Override
   public AttributeList setAttributes(AttributeList var1) {
      return new AttributeList();
   }
}
