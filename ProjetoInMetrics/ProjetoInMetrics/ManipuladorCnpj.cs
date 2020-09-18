using Refit;
using System.Threading.Tasks;

// Funcao 'GetAddressAsync' pega CNPJ informado
namespace ProjetoInMetrics
{
    public interface ManipuladorCnpj
    {
        [Get("/v1/cnpj/{CnpjSelecionado}")]
        Task<InfoApi> GetAddressAsync(string CnpjSelecionado); // Faz a chamada de InfoApi

    }
}
