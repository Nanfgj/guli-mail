package com.atguigu.gulimall.search.service;
import com.atguigu.common.to.es.SkuEsModel;
import java.io.IOException;
import java.util.List;

/**
 *
 * 保存商品信息
 **/
public interface ProductSaveService {

    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
