package com.example.Server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NettyUdpHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    private static final Log logger = LogFactory.getLog("udp");

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
        try {
            ByteBuf byteBuf = packet.content();
            String str = byteBuf.toString(CharsetUtil.UTF_8);
            logger.info("receive str: " + str);

            // res
            String resStr = "ok";
            byte[] resBytes = resStr.getBytes("UTF-8");
            DatagramPacket resData = new DatagramPacket(Unpooled.copiedBuffer(resBytes), packet.sender());
            ctx.writeAndFlush(resData);
        } catch (Exception e) {
        }
    }
}

