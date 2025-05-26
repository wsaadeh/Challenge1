## DESAFIO: Componentes e injeção de dependência

Você deve criar um sistema para calcular o valor total de um pedido, considerando uma porcentagem
de desconto e o frete. O cálculo do valor total do pedido consiste em aplicar o desconto ao valor
básico do pedido, e adicionar o valor do frete. A regra para cálculo do frete é a seguinte:

<Table>
  <tr>
    <td>Valor básico do pedido(sem desconto)</td>
    <td>Frete</td>
  </tr>
  <tr>
    <td>Abaixo de RS100.0</td>
    <td>R$ 20.0</td>
  </tr>
  <tr>
    <td>De R$ 100.0 até R$ 200.0 exclusive </td>
    <td>R$ 12.0 </td>
  </tr>
  <tr>
    <td>R$ 200 ou mais </td>
    <td>Grátis </td>
  </tr>
</Table>

Exemplo 1:
<table>
  <tr>
    <td>ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)</td>
    <td>SAÍDA</td>
  </tr>
  <tr>
    <td>
      1034</br>
      150.0</br>
      20.0
    </td>
    <td>
      Pedido código: 1034</br>
      Valor total: R$ 132.00
    </td>
  </tr>  
</table>


Exemplo 2:
<table>
  <tr>
    <td>ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)</td>
    <td>SAÍDA</td>
  </tr>
  <tr>
    <td>
      2082</br>
      800.0</br>
      10.0
    </td>
    <td>
      Pedido código: 2082</br>
      Valor total: R$ 720.00
    </td>
  </tr>  
</table>


Exemplo 3:
<table>
  <tr>
    <td>ENTRADA (dados do pedido: código, valor básico, porcentagem de desconto)</td>
    <td>SAÍDA</td>
  </tr>
  <tr>
    <td>
      1309</br>
      90.9</br>
      0.0
    </td>
    <td>
      Pedido código: 1309</br>
      Valor total: R$ 115.90
    </td>
  </tr>  
</table>

Sua solução deverá seguir as seguintes especificações:
Um pedido deve ser representado por um objeto conforme projeto abaixo:

<table>
  <tr><td><b>Order</b></td></tr>
  <tr><td>- code: Integer</td></tr>
  <tr><td>- basic: Double</td></tr>
  <tr><td>- discount: Double</td></tr>
</table>

A lógica do cálculo do valor total do pedido deve ser implementada por componentes (serviços), cada
um com sua responsabilidade, conforme projeto abaixo:
<table>
  <tr>
    <td>
      <table>
        <tr><td><b>OrderService</b></td></tr>
        <tr><td>&nbsp;</td></tr>
        <tr><td>+ total(order: Order): double</td></tr>  
      </table>
    </td>
    <td>--------></td>
    <td>
      <table>
        <tr><td><b>ShippingService</b></td></tr>
        <tr><td>&nbsp;</td></tr>
        <tr><td>+ shipment(order: Order): double</td></tr>  
      </table>
    </td>
</tr>
</table>
<p>Serviço OrderService: responsável por operações referentes a pedidos.
Serviço ShippingService: responsável por operações referentes a frete.</p>
<p>Sua solução deverá ser implementada em Java com Spring Boot. A saída deverá ser mostrada no log
do terminal da aplicação. Cada serviço deve ser implementado como um componente registrado com
@Service.</p>
