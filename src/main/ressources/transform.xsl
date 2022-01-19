<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
    <html>
      <head>
        <title>Menus</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous"/>
      </head>
      <body>
        <div class="container">
          <h1>Menus</h1>
          <xsl:for-each select="data/menus/menu">
            <div class="card mb-2">
              <div class="card-body">
                <p class="card-text">ID:
                  <xsl:value-of select="id"/>
                </p>
                <p class="card-text">Name:
                  <xsl:value-of select="name"/>
                </p>
                <p class="card-text">Root (Yes/No):
                  <xsl:value-of select="root"/>
                </p>
              </div>
            </div>
          </xsl:for-each>
          <h1>Items</h1>
          <xsl:for-each select="data/items/item">
            <div class="card mb-2">
              <div class="card-body">
                <p class="card-text">ID:
                  <xsl:value-of select="id"/>
                </p>
                <p class="card-text">Name:
                  <xsl:value-of select="name"/>
                </p>
                <p class="card-text">Link:
                  <xsl:value-of select="link"/>
                </p>
                <p class="card-text">Is stored in Menu:
                  <xsl:value-of select="root_menu"/>
                </p>
              </div>
            </div>
          </xsl:for-each>
        </div>
      </body>
    </html>
</xsl:template>
</xsl:stylesheet>
