<#include "security.ftl">



<nav class="uk-navbar-container uk-margin" uk-navbar>
    <div class="uk-navbar-left">

                <a class="uk-navbar-toggle" uk-navbar-toggle-icon href="#">

                    <div class="uk-navbar-dropdown">
                        <ul class="uk-nav uk-navbar-dropdown-nav">
                            <li class="uk-active"><a href="#">Active</a></li>
                            <li><a href="#">Item</a></li>
                            <li class="uk-nav-header">Header</li>
                            <li><a href="#">Item</a></li>
                            <li><a href="#">Item</a></li>
                            <li class="uk-nav-divider"></li>
                            <li><a href="#">Item</a></li>
                        </ul>
                    </div>
                </a>
    </div>
    <div class="uk-navbar-right">
        <div>
            <a class="uk-navbar-toggle" uk-search-icon href="#"></a>
            <div class="uk-drop" uk-drop="mode: click; pos: left-center; offset: 0">
                <form class="uk-search uk-search-navbar uk-width-1-1">
                    <input class="uk-search-input" type="search" placeholder="Search..." autofocus>
                </form>
            </div>
        </div>
        <div class="uk-navbar-item">
            <div><#if user??> <a href="#">${name}</a><#else>name(link)O_O </#if></div>
        </div>
        <div>
            <a href="#">Logout</a>
        </div>
    </div>
</nav>
