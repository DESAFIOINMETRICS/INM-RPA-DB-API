using Newtonsoft.Json;
using Refit;
using System;
using System.Threading.Tasks;

namespace ProjetoInMetrics
{
    class Program
    {
        static async Task Main(string[] args)
        {
            try 
            {
                var enderecoApi = RestService.For<ManipuladorCnpj>("http://www.receitaws.com.br"); // Declarando objeto "enderecoApi" para possuir os metodos do "ManipuladoCnpj" e mostrando o endereco da API
                /* Codigo que permite pesquisar qualquer CNPJ
                 * Console.Write("Digite o CNPJ desejado:\t");
                 * string CnpjInformado = Console.ReadLine();
                 * var InformacoesApi = await enderecoApi.GetAddressAsync(CnpjInformado);
                */
                var InformacoesApi = await enderecoApi.GetAddressAsync("04959158000225");// Chamando o metodo no qual consegue realizar a chamada da API e salva na variavel "InformacoesApi"
                var RetornoApiJson = JsonConvert.SerializeObject(InformacoesApi); // Transformando "InformacoesApi" em uma base de dados Json
                Console.WriteLine("Json com valores da API: \n" + RetornoApiJson);
                Console.ReadLine();
            }
            catch (Exception e)
            {
                Console.WriteLine("Cnpj não encontrada ou não válida:\t" + e.Message);
            }
        }
    }
}
